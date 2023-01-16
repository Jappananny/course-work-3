package ru.service.socksapp.service;
import ru.service.socksapp.model.SocksColor;
import ru.service.socksapp.model.SocksSize;

public interface SocksService {

 boolean addSocks(SocksColor socksColor, SocksSize socksSize, int cottonPart, int quantity);
 boolean removeSocks(SocksColor socksColor, SocksSize socksSize,int cottonPart, int quantity);
 boolean disposalSocks(SocksColor socksColor, SocksSize socksSize,int cottonPart, int quantity);
 int findTheMinimumCottonPart(SocksColor socksColor, SocksSize socksSize, int cottonMin);
 int findTheMaximumCottonPart(SocksColor socksColor, SocksSize socksSize, int cottonMax);




}
