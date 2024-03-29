package Creation.Builder.DataAbstaractBuilder;

public class JsonBuilder extends Builder{
    public JsonBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "{";
    }

    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"name\" : ");
        sb.append("\"" + data.getName() + "\", ");
        sb.append("\"age\" : ");
        sb.append("\"" + data.getAge() + "\"");

        return sb.toString();
    }

    @Override
    public String foot() {
        return "}";
    }
}
