package app.play;

import app.cardInfo.CardInfo;
import app.tableInfo.subTable.CardTable;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//1. 분류할 물건 정하기
/*
1. 개수 - 입력값
2. 난이도 - 입력값
3. 테이블 - 저장소, 카운터 테이블, 게임 테이블

2. 디테일

1. 카드 - ID, 이름, 배치번호, Pair 완료 여부
 */
public class Play {

    enum Difficulty {

        NULL, // 0 보통 게임은 1부터 시작하므로 Null값을 넣어줘서 0울 버린다
        EASY, // 1
        NORMAL, // 2
        HARD // 3

    }

    private int totalCardNumber; // 총 카드 갯수
    private Difficulty gamedifficulty; // 게임 난이도


    public void playGame() {
        
        Scanner scanner = new Scanner(System.in);
        //read me. 테이블의 크기를 정하는데서 유저들이 신선함을 느끼도록 하고싶다
        //1. 오프닝 텍스트 출력
        System.out.println("🃏🃏짝 맞추기 게임을 시작합니다🃏🃏");
        System.out.println("-".repeat(60)); // repeat - 60번 반복출력
        //2. 플레이 방법 소개 출력
        System.out.println("임의의 카드 갯수를 입력한후 숨어있는 문자의 짝을 맞추세요");
        //3. 엔터를 입력 받아서 게임 시작
        //IDE 특성상 내부에서 미구현 외부에서 구현 예정
        //난이도(동일한 페어 개수) 입력 받기

        // 테이블 갯수
        System.out.println("카드의 갯수를 입력받으세요(최소 30개 최대 300개 사이의 짝수)");
        // 홀수 입력시 if 문자 try catch 로 예외처리
        this.totalCardNumber = Integer.parseInt(scanner.nextLine()); // 총 카드 갯수 입력 받기
        System.out.println("(1)쉬움, (2)중간, (3)어려움"); // 쉬움 3짝 중간 2짝 어려움 1짝
        this.gamedifficulty = Difficulty.valueOf(scanner.nextLine());
        //5. gameTable 생성
            /*
            테이블 생성 조건 = 카드와 테이블
            총 카드 개수, 난이도
            카드 갯수 만큼 알파벳 생성
             */
        
        ArrayList<CardInfo> cardSet = new ArrayList<>();
        /*
        ArrayList<CardInfo> cardInfo를 타입으로 지정할수 있다.
        ArrayList<CardInfo> cardInfo 처럼 제네릭으로 class 사용시 한정적인 변수 타입에서
        모든 cardInfo에서 가지고있는 모든 타입을 다 쓸수 있어서 확장성이 용이하다
        **존좋**
         */
        CardTable cardTable = new CardTable(cardSet); // 테이블 생성

        /*
        ArrayList 사용
        hashMap
        */


        HashMap<Integer, CardInfo> map = new HashMap<>();

        char startch = 'A';
        String currentStr = "";
        int offset1 = 0;
        int offset2 = 0;
        int rep = 0;
        switch (gamedifficulty) {
            case EASY: rep = 6; break;
            case NORMAL: rep = 4; break;
            case HARD: rep = 2; break;
        }

        // ToDo
        // STOPSHIP: 2023-01-08
        for (int i = 1; i <= this.totalCardNumber; i++) {
            currentStr = String.format("%c%c",
                    startch + offset1,
                    startch + offset2
            );
            CardInfo card = new CardInfo(i, currentStr, 0);

            if (i % rep == 0) offset2++;
            if (offset2 > 25) {
                offset2 = 0;
                offset1++;
                System.out.println();
            }
        }

        //6. 숫자로 숨겨져 있는 카드 테이블 출력
        //7. 맞춘 곳은 wild문자로 변환
        //8. 주어진 횟 수 안에 완료 시 성공 출력
        //9. 주어진 횟 수를 초과하면 실패
        //10. 6~9번 반복
        //11. 모두 완료 되면 시도 횟수와 실패 횟수 출력
        //12. 각각 카드 counterTable 보여주기
        //13. 종료!
    }

    public void increaseString(int count) {


    }

}




