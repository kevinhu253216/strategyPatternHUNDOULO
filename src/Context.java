//5、对战模式
public class Context {
    //构造函数，你要使用玩那种模式
    private IWeaponStrategy straegy;
    public Context(IWeaponStrategy strategy){
        this.straegy = strategy;
    }

    //根据不同模式装备不同武器
    public void operate(){
        this.straegy.operate();
    }
}
