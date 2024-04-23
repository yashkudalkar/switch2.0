import java.util.HashMap;

final class ImmutableEmployee {

    private int id;
    private String name;
    private HashMap<String, String> roles;

    public ImmutableEmployee(int id, String name, HashMap<String, String> roles) {
        this.id = id;
        this.name = name;

        HashMap<String, String> temp = new HashMap<>();
        roles.keySet().forEach(k -> temp.put(k, roles.get(k)));
        this.roles = temp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getRoles() {
        return (HashMap<String, String>) roles.clone();
    }
}

public class CustomImmutableExample {

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "Yash";

        int i=10;

        ImmutableEmployee ce = new ImmutableEmployee(i,s,h1);

        // print the ce values
        System.out.println("ce id: "+ce.getId());
        System.out.println("ce name: "+ce.getName());
        System.out.println("ce roles: "+ce.getRoles());

        // change the local variable values
        i=20;
        s="modified";
        h1.put("3", "third");
        // print the values again
        System.out.println("ce id after local variable change: "+ce.getId());
        System.out.println("ce name after local variable change: "+ce.getName());
        System.out.println("ce roles after local variable change: "+ce.getRoles());

        HashMap<String, String> hmTest = ce.getRoles();
        hmTest.put("4", "new");

        System.out.println("ce roles after changing variable from getter methods: "+ce.getRoles());

    }
}
