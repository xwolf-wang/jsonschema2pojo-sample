package com.java2Schema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjetland.jackson.jsonSchema.JsonSchemaGenerator;

public class Java2JsonSchema {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonSchemaGenerator jsonSchemaGenerator = new JsonSchemaGenerator(objectMapper);

        // If using JsonSchema to generate HTML5 GUI:
        // JsonSchemaGenerator html5 = new JsonSchemaGenerator(objectMapper, JsonSchemaConfig.html5EnabledSchema() );

        // If you want to configure it manually:
        // JsonSchemaConfig config = JsonSchemaConfig.create(...);
        // JsonSchemaGenerator generator = new JsonSchemaGenerator(objectMapper, config);


        JsonNode jsonSchema = jsonSchemaGenerator.generateJsonSchema(MyObject.class);

        String jsonSchemaAsString = objectMapper.writeValueAsString(jsonSchema);

        System.out.println(jsonSchemaAsString);
    }
}
