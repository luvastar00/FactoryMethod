/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;
import pizza.Pizza;
import pizza.PizzaType;
import store.ChicagoPizzaStore;
import store.NYPizzaStore;
import store.PizzaStore;
/**
 *
 * @author GIGABYTE
 */
public class FactoryMethod {
    public static void main(String[] args)
    {
        // TODO code application logic here
        PizzaStore store = new ChicagoPizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.pepperoni);
        System.out.println(pizza.toString());
        
        PizzaStore nYStore = NYPizzaStore.Store();
        Pizza nYPizza = nYStore.orderPizza(PizzaType.clam);
        System.out.println(nYPizza.toString());
    }
}