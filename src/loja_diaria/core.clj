(ns loja-diaria.core)

(def dados-diarios-agregados
  [{:operacao "venda" :cliente "regular" :valor 100}
   {:operacao "cancelamento" :cliente "regular" :valor 100}
   {:operacao "venda" :cliente "regular" :valor 80}
   {:operacao "venda" :cliente "especial" :valor 50}])

(defn total-de-operacoes [dados operacao]
  (count
    (filter #(= (:operacao %) operacao)
            dados)))

(defn calcular-valor-venda [venda]
  (if (= (:cliente venda) "especial")
    (* (:valor venda) 0.9)
    (:valor venda)))

(defn total-vendas-sucesso [dados]
  (let [vendas (filter #(= (:operacao %) "venda") dados)]
    (reduce + (map calcular-valor-venda vendas))))

(defn saldo-dia [dados]
  (- (total-vendas-sucesso dados)
     (reduce + (map :valor
                    (filter #(= (:operacao %) "cancelamento") dados)))))

(defn -main [& args]
  (println "Total de vendas concluídas com sucesso:" (total-vendas-sucesso dados-diarios-agregados))
  (println "Total de vendas canceladas:" (total-de-operacoes dados-diarios-agregados "cancelamento"))
  (println "Saldo do dia:" (saldo-dia dados-diarios-agregados)))