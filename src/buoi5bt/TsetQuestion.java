package buoi5bt;

import java.util.Scanner;

public class TsetQuestion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Question[] questions = new Question[9];

        questions[0] = new Question("Bác Hồ sinh ở đâu?","A.Hà Nội","B.Sài Gòn","C.Thanh Hóa","D.Nghệ An","D","De");
        questions[1] = new Question("Ai người đầu tiên bày vào vũ trụ?","A.Yuri Gagarin","B.Neil Armstrong","C.Phạm Tuân","D.Alan Bean","A","De");
        questions[2] = new Question("Hãng xe nào của Italia","A.Toyota","B.Hyndai","C.Ferrari","D.Ford","C","De");
        questions[3] = new Question("Đâu là hidrocacbon thơm?","A.Axetilen","B.Toluen","C.Buta-1,3-dien","D.metan","B","TB");
        questions[4] = new Question("Tên đồ tể nổi tiếng nhất nước Anh tên gì?","A.John","B.Kala","C.Jack","D.David","C","TB");
        questions[5] = new Question("Đâu là hòn đảo lớn nhất Việt Nam?","A.Lý Sơn","B.Cù Lao Chàm","C.Phú QUốc","D.Cát Bà","C","TB");
        questions[6] = new Question("Loại xe tăng sản xuất nhiều nhất trong WWII","A.T-34","B.TigerI","C.Panther","D.IS-2","C","Kho");
        questions[7] = new Question("Quảng trường Thời Đại nằm ở nước nào?","A.Nga","B.Mỹ","C.Trung Quốc","D.Nhật Bản","B","Kho");
        questions[8] = new Question("Tổng thống thứ 16 của Hoa Kỳ là?","A.George Washington","B.Thomas Jefferson","C.Abraham Lincoln","D.Theodore Roosevelt","C","Kho");

        System.out.println("Do kho muon test (nhap vao do kho tuong ung voi : De = De, Trung binh = TB, Kho = Kho ");
        String dokho = scanner.nextLine();
        QuestionManagement questionManagement = new QuestionManagement(questions);

        questionManagement.dokhoQuestion(dokho);

        System.out.println("Moi nhap dap an dap an");

    }
}
