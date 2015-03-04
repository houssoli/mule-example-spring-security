package org.ordermanagement;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonAutoDetect;


/**
 * An order.
 * 
 * @author david.eason@mulesoft.com
 */
@JsonAutoDetect
public class Order {

    @NotNull
    private String champAValider;

    private String orderId;

	/** Customer associated with order */
	private OrderPerson customer;

	/** List of items on an order */
	private List<OrderItem> items;

    @NotNull
    public String getChampAValider() {
        return champAValider;
    }

    @NotNull
    public void setChampAValider(String champAValider) {
        this.champAValider = champAValider;
    }

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderPerson getCustomer() {
		return customer;
	}

	public void setCustomer(OrderPerson customer) {
		this.customer = customer;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
}