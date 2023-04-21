require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /BankTheme 

state: Loan
            q!: * кредит* *
            a: Что вам подсказать?

        	state: TakeLoan
            	    q: * ~оформить кредит* *
            	    a: Какой тип кредита интересен?

            		state: LoanTypes
                	    q: * (авто*|~жильё|персон*) *
                	    go!: /FillTheLoanForm
