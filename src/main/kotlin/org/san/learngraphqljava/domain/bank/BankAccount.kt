package org.san.learngraphqljava.domain.bank

import java.util.UUID

data class BankAccount(val id: UUID, val client: Client, val currency: Currency)
