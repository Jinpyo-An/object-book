package hello.discountpolicy;

import hello.Money;
import hello.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
