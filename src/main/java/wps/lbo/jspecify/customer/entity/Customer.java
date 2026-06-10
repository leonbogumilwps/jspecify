package wps.lbo.jspecify.customer.entity;

import org.jspecify.annotations.Nullable;

public record Customer(Long id, @Nullable String name, String status)
{

}
