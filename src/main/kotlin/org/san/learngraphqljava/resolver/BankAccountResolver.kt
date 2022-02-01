package org.san.learngraphqljava.resolver

import graphql.kickstart.tools.GraphQLQueryResolver
import org.san.learngraphqljava.domain.bank.BankAccount
import org.san.learngraphqljava.domain.bank.Client
import org.san.learngraphqljava.domain.bank.Currency.INR
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class BankAccountResolver : GraphQLQueryResolver {
    public fun bankAccount(id: UUID): BankAccount {
        println("Retrieving Bank Account id : $id")
        return BankAccount(
            id,
            Client(id, "Santaji", "Suryawanshi"),
            currency = INR
        )
    }
}
