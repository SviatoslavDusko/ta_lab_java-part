package com.epam.lab.hw_15_json.task5;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.task5("src/main/java/com/epam/lab/hw_15_json/task1/file.json",
                "src/main/java/com/epam/lab/hw_15_json/task1/file-schema.json"));
    }

    private boolean task5(String json, String schema) {
        try {
            JSONTokener schemaData = new JSONTokener(new FileInputStream(new File(schema)));
            JSONObject jsonSchema = new JSONObject(schemaData);

            JSONTokener jsonData = new JSONTokener(new FileInputStream(new File(json)));
            JSONObject jsonObject = new JSONObject(jsonData);

            Schema schemaValidator = SchemaLoader.load(jsonSchema);
            schemaValidator.validate(jsonObject);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
