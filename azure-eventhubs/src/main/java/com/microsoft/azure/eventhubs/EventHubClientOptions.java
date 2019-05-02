/*
 * Copyright (c) Microsoft. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package com.microsoft.azure.eventhubs;

import java.time.Duration;

public class EventHubClientOptions {
	private Duration operationTimeout = null;
	private TransportType transportType = null;
	private RetryPolicy retryPolicy = null;

	public EventHubClientOptions() {
	}
	
	public void setOperationTimeout(Duration operationTimeout) {
		this.operationTimeout = operationTimeout;
	}
	
	public Duration getOperationTimeout() {
		return this.operationTimeout;
	}
	
	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}
	
	public TransportType getTransportType() {
		return this.transportType;
	}
	
	public void setRetryPolicy(RetryPolicy retryPolicy) {
		this.retryPolicy = retryPolicy;
	}
	
	public RetryPolicy getRetryPolicy() {
		return this.retryPolicy;
	}
}
