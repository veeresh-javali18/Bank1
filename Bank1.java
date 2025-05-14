
class TranscationHistory {
  String Sender;
  String Reciver;
  String status;
  String Date;
  float TranscationId;

  static int totalTranscation = 0;

  TranscationHistory(String Sender, String Reciver, String status, String Date, float TranscationId) {
    this.Sender = Sender;
    this.Reciver = Reciver;
    this.status = status;
    this.Date = Date;
    this.TranscationId = TranscationId;
    totalTranscation++;
  }

  public void details() {
    System.out.println("TranscationId" + TranscationId);
    System.out.println("SenderName:  " + Sender);
    System.out.println("ReciverName :" + Reciver);
    System.out.println("status" + status);
    System.out.println("Date" + Date);
    System.out.println("totalTranstaction" + totalTranscation);
  }
}

public class Bank1 {
  public static void main(String[] args) {
    TranscationHistory Th = new TranscationHistory("Anish", "veeresh", "succesful", "22-10-2025", 1);
    Th.details();
  }
}
