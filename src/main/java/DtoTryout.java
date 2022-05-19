import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DtoTryout {
    public static void main(String[] args) throws JsonProcessingException {

        DtoExample dto = new DtoExample(42, "Tom", "tom.kemper@hu.nl");
        System.out.println(dto);
        System.out.println(dto.emailaddress());

        ObjectMapper mapper = new ObjectMapper();
        String jsonResult = mapper.writeValueAsString(dto);
        System.out.println(jsonResult);

        DtoExample uitJson = mapper.readValue(jsonResult, DtoExample.class);
        System.out.println(uitJson.name());
    }

}
