package app.tableInfo;

import java.util.ArrayList;

//3. 테이블 - 카운터 테이블(숫자형), 게임 테이블(문자형)
public abstract class Table<T> {
    private ArrayList<T> cardSet;
    private int tableWidth;

    public Table(ArrayList<T> cardSet) {
        this.cardSet = cardSet;
    }

    public ArrayList<T> getCardSet() {
        return cardSet;
    }

    public void setCardSet(ArrayList<T> cardSet) {
        this.cardSet = cardSet;
    }

    //카드세트에 요소를 추가하는 기능
    public void addToTable(T t){
        this.cardSet.add(t);
    }
}


