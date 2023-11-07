package com.dqtri.clean.handbook.classes.OrganizingForChange;

public class IsolatingfromChange {
    class Portfolio {
        private StockExchange exchange;
        Portfolio(StockExchange exchange) {
            this.exchange = exchange;
        }
        // ...
        void add(int n, String s){

        }
    }

     interface StockExchange {
        Money currentPrice(String symbol);
    }

     class PortfolioTest {
        private FixedStockExchangeStub exchange;
        private Portfolio portfolio;

//        @Before
        protected void setUp() throws Exception {
            exchange = new FixedStockExchangeStub();
            exchange.fix("MSFT", 100);
            portfolio = new Portfolio(exchange);
        }

//        @Test
        public void GivenFiveMSFTTotalShouldBe500() throws Exception {
            portfolio.add(5, "MSFT");
//            Assert.assertEquals(500, portfolio.value());
        }
    }

    class FixedStockExchangeStub implements StockExchange {
        void fix(String t, int a){}

        @Override
        public Money currentPrice(String symbol) {
            return null;
        }
    }

    class Money {

    }
}
