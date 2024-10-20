package decoratorDesignPattern;

import decoratorDesignPattern.baseclasses.BasePizza;
import decoratorDesignPattern.baseclasses.Farmhouse;
import decoratorDesignPattern.baseclasses.Margherita;
import decoratorDesignPattern.decorator.CheeseDecoratorImpl;
import decoratorDesignPattern.decorator.SweetCornDecoratorImpl;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizza farmhouse = new Farmhouse();
        BasePizza farmhouseExtraCheese =new CheeseDecoratorImpl(new Farmhouse());
        BasePizza MarghertiaAlltoppings = new SweetCornDecoratorImpl(new CheeseDecoratorImpl(new Margherita()));
        System.out.println(farmhouse.cost());
        System.out.println(farmhouseExtraCheese.cost());
        System.out.println(MarghertiaAlltoppings.cost());

    }
}
