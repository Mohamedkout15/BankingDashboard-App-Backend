package zz.sk.bankingdashboard.Configuration ;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import zz.sk.bankingdashboard.Entities.Adresse;

import java.io.IOException;

public class AdresseDeserializer extends StdDeserializer<Adresse> {

    public AdresseDeserializer() {
        this(null);
    }

    public AdresseDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Adresse deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        String adresse = getTextValue(node, "adresse");
        String ville = getTextValue(node, "ville");
        String gouvernerat = getTextValue(node, "gouvernerat");
        String codepostal = getTextValue(node, "codepostal");
        String pays = getTextValue(node, "pays");

        return new Adresse(adresse, ville, gouvernerat, codepostal, pays);
    }

    private String getTextValue(JsonNode node, String fieldName) {
        JsonNode fieldNode = node.path(fieldName);
        if (fieldNode.isMissingNode()) {
            return null; // or any default value
        } else if (fieldNode.isNull()) {
            return null; // or any default value
        } else {
            return fieldNode.asText();
        }
    }
}

