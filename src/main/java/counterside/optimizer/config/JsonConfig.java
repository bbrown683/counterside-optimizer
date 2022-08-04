package counterside.optimizer.config;

import java.io.InputStream;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import counterside.optimizer.types.gear.Gear;

@Configuration
public class JsonConfig {
    private ObjectMapper mapper = new ObjectMapper();

    @Bean
    public List<Gear> gearList() throws Exception {
        InputStream stream = JsonConfig.class.getResourceAsStream("/data/gear/gear.json");
        List<Gear> gearList = mapper.readValue(stream, new TypeReference<List<Gear>>(){});      
        return gearList;
    }
}
