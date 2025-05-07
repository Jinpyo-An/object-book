package hello.discountcondition;

import hello.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
