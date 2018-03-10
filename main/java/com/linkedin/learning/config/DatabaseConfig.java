package com.linkedin.learning.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
@EnableJpaRepositories("com.linkedin.learning.repository")
@EnableTransactionManagement
public class DatabaseConfig {
}
