package decoratorDesignPattern.decorator;

import decoratorDesignPattern.baseclasses.BasePizza;

public class SweetCornDecoratorImpl extends Toppings {
    BasePizza pizza;
    public SweetCornDecoratorImpl(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost() + 35;
    }
}
