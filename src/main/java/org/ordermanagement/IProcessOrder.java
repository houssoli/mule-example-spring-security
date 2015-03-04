package org.ordermanagement;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.validation.annotation.Validated;

/**
 * Interface for order processing.
 * 
 * @author david.eason@mulesoft.com
 */

@Path("/ordermgmt")
public interface IProcessOrder {

    /**
     * Retrieve an Order.
     * 
     * @param orderId
     *            Identifier of Order to be retrieved
     * @return Order
     */
    @GET
    @Produces("application/json")
    @Path("/order/{orderId}")
    OrderConfirmation retrieveOrder(String orderId);

    /**
     * Create an order.
     * 
     * @return String orderId
     */
    @PUT
    @Produces("application/json")
    @Path("/order")
    OrderConfirmation createOrder(@Validated Order order);

    /**
     * Update an order.
     * 
     * @param order
     * @return Order
     */
    @POST
    @Produces("application/json")
    @Path("/order")
    OrderConfirmation updateOrder(@Validated Order order);

    /**
     * Delete an order.
     * 
     * @param orderId
     *            Identifier of Order to be deleted
     * @return String
     */
    @DELETE
    @Produces("application/json")
    @Path("/order/{orderId}")
    OrderConfirmation deleteOrder(String orderId);
}
