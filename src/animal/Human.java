package animal;

public class Human extends Animal implements Thinkable {
    // フィールド
    private String pastime; // 趣味
    
    // getter
    public String getPastime() {
        return pastime;
    }
    
    // setter
    public void setPastime(String pastime) {
        this.pastime = pastime;
    }
    
    public Human() {
    }
    
    // 引数ありのコンストラクタ
    public Human(String name, int age, String pastime) {
        super(name,age); // スーパークラス（Animal)のコンストラクタを呼び出し
        this.pastime = pastime;
    }
    
    // thinkメソッド
    @Override
    public void think(){
        System.out.println("私は" + pastime + "について考えています。");
    }

}
