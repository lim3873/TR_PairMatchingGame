package app.tableInfo.subTable;

import app.tableInfo.Table;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

// 게임 상에 나오는 페어카드들
public class CardTable extends Table<String> {

    // 남은 페어 수
    private int leftPair;

    public CardTable(ArrayList<String> cardSet) {
        super(cardSet);
    }

    public int getLeftPair() {
        return leftPair;
    }

    // 남은 페어 수 세주는 메소드
    public void countLeftPair() {

        //table클래스에서 catdset을 super을 이용해 가져오는데 0번 인덱스를 가져와 변수에 저장한다.
        ArrayList<String> cardSetList;
        cardSetList = super.getCardSet();

        //검색해야할 대상은 cardSet에 있는 Null이 아닌 데이터이다.
        //1. stream으로 변환을 한다.
        Stream<String> cardSetstream = cardSetList.stream();

        //2. stream에 있는 메소드들을 이용해서 Null이 아닌 데이터 카운트 하는 방법을 이용한다.
        //3. 카운트 된 값을 leftPair에 넣어준다.
        this.leftPair = (int) cardSetstream
                                    .filter(Objects::nonNull)
                                    .count();

    }
}
