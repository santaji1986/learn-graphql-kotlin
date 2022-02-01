package org.san.learngraphqljava.resolver

import graphql.kickstart.tools.GraphQLQueryResolver
import org.san.learngraphqljava.domain.generated.enums.Currency
import org.san.learngraphqljava.domain.generated.getbankaccount.BankAccount
import org.san.learngraphqljava.domain.generated.getbankaccount.Client
import org.springframework.stereotype.Component

@Component
class BankAccountResolver : GraphQLQueryResolver {
    public fun bankAccount(id: String): BankAccount {
        println("Retrieving Bank Account id : $id")
        return BankAccount(
            id = id,
            Client(id, "Santaji", "Suryawanshi"),
            currency = Currency.INR
        )
    }
}
