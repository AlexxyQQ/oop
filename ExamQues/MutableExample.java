package ExamQues;

public class MutableExample {
    private String Name;

    MutableExample(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Gem) {
        this.Name = Gem;
    }
}

class TestMutableExample {
    public static void main(String[] args) {
        MutableExample obj = new MutableExample("gem");
        System.out.println(obj.getName());

        // updating
        obj.setName("helloMan");
        System.out.println(obj.getName());

    }
}
