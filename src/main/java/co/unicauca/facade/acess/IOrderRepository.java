/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.acess;

import co.unicauca.facade.domain.order.Order;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public interface IOrderRepository {
    public void createOrder(Order order);
}
