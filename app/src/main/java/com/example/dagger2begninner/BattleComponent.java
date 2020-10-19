package com.example.dagger2begninner;

import dagger.Component;

@Component
interface BattleComponent {
    War getWar();
}
