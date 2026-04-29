package consts;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Product {
    TenutaSant("397832088-904886308382-tenuta-santilario-chianti-classico", "TenutaSant");

    private final String link;
    private final String shortName;
    }

