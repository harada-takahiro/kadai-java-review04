package animal;

public class Animal {
    // フィールド
    private String name; // 名前
    private int age; // 年齢
    
    // getter
    public String getName() {
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }
    
    // getter    
    public int getAge() {
        return age;
    }
    
    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
    }
    
    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // sayメソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}
