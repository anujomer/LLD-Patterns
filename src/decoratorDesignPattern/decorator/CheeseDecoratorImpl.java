package decoratorDesignPattern.decorator;

import decoratorDesignPattern.baseclasses.BasePizza;

public class CheeseDecoratorImpl extends Toppings{

    BasePizza pizza;

    public CheeseDecoratorImpl(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 10;
    }
}
