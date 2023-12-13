// JsonS.java
package lab2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonS implements Serializer {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> void serialize(T entity, String filename) throws IOException {
        String json = mapper.writeValueAsString(entity);
        Files.write(Paths.get(filename), json.getBytes());
    }

    @Override
    public <T> T deserialize(String filename, Class<T> entityType) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get(filename));
        return mapper.readValue(jsonData, entityType);
    }
}