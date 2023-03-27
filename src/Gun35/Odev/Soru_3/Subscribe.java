package Gun35.Odev.Soru_3;

public class Subscribe {
    private String name;
    private boolean doYouWannaSubscribe;
    private String whichMember;

    private MemberShip memberShip;
    public Subscribe(String name, boolean doYouWannaSubscribe, MemberShip memberShip) {
        setName(name);
        setDoYouWannaSubscribe(doYouWannaSubscribe);
        setWhichMember(whichMember);
        setMemberShip(memberShip);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setDoYouWannaSubscribe(boolean doYouWannaSubscribe){
        this.doYouWannaSubscribe = doYouWannaSubscribe;
    }
    public boolean getDoYouWannaSubscribe(){
        return this.doYouWannaSubscribe;
    }

    public void setWhichMember(String whichMember){
        this.whichMember = whichMember;
    }
    public String getWhichMember(){
        return this.whichMember;
    }
    public void setMemberShip(MemberShip memberShip){
        this.memberShip = memberShip;
    }
    public MemberShip getMemberShip(){
        return this.memberShip;
    }
}
