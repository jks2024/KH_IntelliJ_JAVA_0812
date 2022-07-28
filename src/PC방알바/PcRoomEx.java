package PC방알바;
public class PcRoomEx {
    public static void main(String[] args) {
       PcRoomCls pcRoomCls = new PcRoomCls();
        pcRoomCls.inputPerson(); // 사용자 수를 입력 받음
        pcRoomCls.calcSeat(); // 사용자가 요청한 좌석에 따라 거절 횟수 누적
        System.out.println(pcRoomCls.getRejectCnt());
    }
}
