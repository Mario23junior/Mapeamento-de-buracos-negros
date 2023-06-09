package com.api.galaxy.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.galaxy.dto.BlackHoleDTO;
import com.api.galaxy.exceptions.ExceptionsReturnMessageError;
import com.api.galaxy.model.BlackHole;
import com.api.galaxy.repository.BlackHoleRepositpry;
import com.api.galaxy.utils.RegressaoLinear;


@Service
public class BlackHoleService {

	private BlackHoleRepositpry blackHoleRepositpry;
	private ModelMapper mapper;

	public BlackHoleService(BlackHoleRepositpry blackHoleRepositpry, ModelMapper mapper) {
		this.blackHoleRepositpry = blackHoleRepositpry;
		this.mapper = mapper;
	}
	
	// Listando todas as galaxias
	// com possiveis buracos negros 
	public List<BlackHoleDTO> listAllData() {
		List<BlackHole> list = blackHoleRepositpry.findAll();
		try {
			return list
					.stream()
					.map(listDto -> mapper.map(listDto, BlackHoleDTO.class))
					.collect(Collectors.toList());
		} catch (ExceptionsReturnMessageError e) {
			throw new ExceptionsReturnMessageError("Erro ao listar de buracos negros ");
		}
 	}
	
	// Classe de retorno predição e recebimento dos dados
	public Double listAllBlackHolePredict(double[] predict, double[] yBase){
		double[] x = predict;
 	    double[] y = yBase;
		return RegressaoLinear.regressaoLinearBlackhole(x, y, 121209);
	}
	
	public ResponseEntity<BlackHoleDTO> listId(Long id) {
		Optional<BlackHole> listId = blackHoleRepositpry.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), BlackHoleDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
	}
	

}
