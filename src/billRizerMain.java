//⑥使用不同武器
public class billRizerMain {
    //比尔.雷泽出场了，他根据不同模式选择了不同的武器
    public static void main(String[] args) {
        Context context;
        //1vs1对战
        context = new Context(new OnetoOneFight());
        context.operate();
        //3vs3对战模式
        context = new Context(new ThreetoThreeFight());
        context.operate();
        //关卡对战模式
        context = new Context(new BarrierFight());
        context.operate();


//        BarrierFight bar=new BarrierFight();
        //       bar.operate();
        //it is ok
    }
}
