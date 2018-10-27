package agency;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    //王婆代理别的女人
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    //王婆年龄大，代理别人抛媚眼
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    //王婆年龄大，代理别人聊天
    public void makeTalk() {
        this.kindWomen.makeTalk();
    }
}
