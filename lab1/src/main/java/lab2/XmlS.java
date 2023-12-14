package lab2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlS implements Serializer {
    private final XmlMapper xmlMapper;

    public XmlS() {
        xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public <T> void serialize(T entity, String filename) throws IOException {
        Path path = Paths.get(filename);
        xmlMapper.writeValue(path.toFile(), entity);
    }

    @Override
    public <T> T deserialize(String filename, Class<T> entityType) throws IOException {
        return xmlMapper.readValue(Paths.get(filename).toFile(), entityType);
    }
}