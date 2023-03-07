package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program_016 {

	public static void main(String[] args) {
		 /*
         * Conceitos importantes
         * 
         * Data-[hora] local:
         * ano-mês-dia-[hora] sem fuso horário
         * [hora] opcional
         * 
         * Data hora global:
         * ano-mês-dia-hora com fuso horário
         * 
         * Duração:
         * tempo decorrido entre duas data-horas
         * 
         * Quando usar?
         * Data-[hora] local:
         * - quando o momento exato não interessa a pessoas de outro fuso horário;
         * - uso comum: sistemas de região única, Excel;
         * - Data de nascimento: "15/06/2001"
         * - Data-hora da venda
         * 
         * Data-hora global:
         * - Quando o momento exato interessa a pessoas de outro fuso horário;
         * - uso comum: sistemas multi-região, web;
         * quando será o sorteio?
         * quando o comentário foi postado?
         * quando foi realizada a venda?
         * inicio e fim do evento?
         * 
         * Timezone (fuso horário)
         * 
         * - GMT - Greenwich Mean Time
         * - horário de Londres;
         * - horário do padrão UTC - Coordinated Universal Time
         * - Também chamado de "Z" time, ou Zulu Time;
         * 
         * - outros fuso horários são relativos ao GMT/UTC:
         * são paulo: gmt-3
         * manaus: gmt-4
         * portugal: gmt+1
         * 
         * Muitas linguagems/tecnologias usam nomes para as timezones:
         * - "US/Pacific"
         * - "America/Sao_Paulo"
         * - etc.
         * 
         * Padrão ISO 8601
         * 
         * Data-[hora] local:
         * 2022-07-21
         * 2022-07-21T14:52
         * 2022-07-21T14:52:09
         * 2022-07-21T14:52:09.4073
         * 
         * Data-hora global:
         * 2022-07-23T14:52:09Z -> Z = horário de londres (gmt)
         * 2022-07-23T14:52:09.254935Z
         * 2022-07-23T14:52:09-03:00 -> -3horas
         * 
         * Operações importantes com data-hora
         * 
         * Instanciação:
         * - (agora) -> Data-hora
         * - Texto ISO 8601 -> Data-hora
         * - Texto formato customizado -> Data-hora
         * - dia, mês, ano, [horário] -> Data-hora local
         * 
         * Formatação:
         * - Data-hora -> Texto ISO 8601
         * - Data-hora -> texto formato customizado
         * 
         * Obter dados de uma data-hora local
         * - Data-hora local -> dia, mês, ano, horário
         * 
         * Converter data-hora global para local
         * - Data-hora global, timezone (sistema local) -> Data-hora local
         * 
         * Cálculos com data-hora
         * - Data-hora +/- tempo -> Data-hora
         * - Data-hora 1, Data-hora 2 -> Duração
         *
         * Principais tipos Java (versão 8+)
         * 
         * Data-hora local:
         * LocalDate
         * LocalDateTime
         * 
         * Data-hora global:
         * Instant
         * 
         * Duração:
         * Duration
         * 
         * Outros:
         * ZoneId
         * ChronoUnit
         */

        // Instanciação

        // definição de um formato customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); // data local
        LocalDateTime d02 = LocalDateTime.now(); // fuso local
        Instant d03 = Instant.now(); // fuso gmt Z

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        // instânca de um formato customizado
        LocalDate d08 = LocalDate.parse("04/03/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2023, 03, 04);
        LocalDateTime d11 = LocalDateTime.of(2023, 03, 04, 15, 07);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        System.out.println();

        // datetime formatter

        // possível chamar dessas formas
        System.out.println("fmt1");
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));

        // fmt2
        System.out.println("fmt2");
        System.out.println("d04 = " + d05.format(fmt2));

        // instant customizado
        System.out.println("instant customizado");
        System.out.println("d06 = " + d06);
        // formatar instant com fuso horário padrão do sistema do usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d06 = " + fmt3.format(d06));
        // instant tem que instsanciar com o fuso horário

        // padrões do java
        System.out.println("padrão do java");
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println("d06 = " + fmt5.format(d06));
        // imprime no formato iso
        System.out.println("d06 = " + d06.toString());
        System.out.println();

        // Converter data hora Global para local
        // data-hora global, timezone(sistema local)
        ZoneId.getAvailableZoneIds(); // lista todos os zoneids disponíveis;

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println();

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto(s) = " + d05.getMinute());
        System.out.println("d05 segundo(s) = " + d05.getSecond());
        System.out.println();

        // calculos com data-hora

        //localDate
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearLocalDate = d04.plusYears(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("nextYearLocalDate = " + nextYearLocalDate);
        System.out.println();
        
        //localDateTime
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println();
        
        //Instant
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println();
        
        //Duração -> só pode ser usado com LocalDateTime
        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t1 = " + t1.toDays());

        //necessário definir a hora das variáveis
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
        System.out.println("t2 = " + t2.toDays());
        
        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("t3 = " + t3.toDays());
        
        // data para trás
        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println("t5 = " + t4.toDays());
	}

}
