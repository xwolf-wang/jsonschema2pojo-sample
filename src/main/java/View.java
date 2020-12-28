import java.net.URI;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/*import model.Game;
import model.Value;*/

public class View {

    public static void main(String[] args) throws Exception {

        URI uri = new URI("http://api.icndb.com/jokes/random");
        ObjectMapper objectMapper = new ObjectMapper();
        Object obj = objectMapper.readValue(uri.toURL(), Object.class);
//        Game game = objectMapper.convertValue(obj, Game.class);
//        game.setAmount(new Double("80.0"));
//        System.out.println(game.getAmount());
//        Value v = game.getValue();
//        System.out.println(v.getId());
//        System.out.println(v.getJoke());
//        System.out.println(v.getCategories());
    }
}
