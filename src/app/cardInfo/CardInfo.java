package app.cardInfo;
// 1. 카드 - ID, 이름, 배치번호, Pair 완료 여부

public class CardInfo {
    //Card에 대한 Field 생성
    private int id;
    private String name; //카드 이름
    private int location; //위치
    private boolean isPairComplete; //페어 완료 여부

    public CardInfo(int id, String name, int location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isPairComplete = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public boolean isPairComplete() {
        return isPairComplete;
    }

    public void setPairComplete(boolean pairComplete) {
        isPairComplete = pairComplete;
    }
}
