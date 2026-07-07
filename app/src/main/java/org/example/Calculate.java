package org.example;

public class Calculate {
  // 年齢に応じた個人料金を返す
  public int getIndividualFee(int age) {
    if (age <= 12) {
      return 1000;
    } else {
      return 2000;
    }
  }

  // 合計料金を返す（10人以上なら10%割引）
  public int getTotalFee(int age, int groupSize) {
    int individualFee = getIndividualFee(age);
    int total = individualFee * groupSize;

    if (groupSize >= 10) {
      total = (int) (total * 0.9); // 10%引き
    }

    return total;
  }
}
