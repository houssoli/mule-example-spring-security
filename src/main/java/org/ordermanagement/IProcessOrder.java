package org.ordermanagement;

import javax.ws.rs.*;

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
    OrderConfirmation createOrder(Order order);

	/**
	 * Update an order.
	 * 
	 * @param order
	 * @return Order
	 */
    @POST
    @Produces("application/json")
    @Path("/order/{orderId}")
    OrderConfirmation updateOrder(String orderId, Order order);

	/**
	 * Delete an order.
	 * 
	 * @param orderId
	 * @return String
	 */
    @DELETE
    @Produces("application/json")
    @Path("/order/{orderId}")
    OrderConfirmation deleteOrder(String orderId);
}
