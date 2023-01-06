package app.tableInfo.subTable;

import app.tableInfo.Table;

import java.util.ArrayList;

public class CounterTable extends Table<Integer> {

    private int totalTryCount = 0;

    public int getTotalTryCount() {
        return totalTryCount;
    }

    public void setTotalTryCount(int totalTryCount) {
        this.totalTryCount = totalTryCount;
    }

    public CounterTable(ArrayList<Integer> cardSet) {
        super(cardSet);
    }

    //횟수를 추가하는 메소드
    public void increaseCountOfTable(int index) {
        //1. 기존 인덱스 값에 1을 추가한다.
        super.getCardSet().add(index,super.getCardSet().get(index) + 1 );
        //총 카운트 갯수 1 증감
        this.totalTryCount++;
    }
}
