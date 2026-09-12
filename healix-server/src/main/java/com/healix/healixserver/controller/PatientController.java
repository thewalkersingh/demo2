package com.healix.healixserver.controller;

import com.healix.healixserver.dto.AppointmentResponseDto;
import com.healix.healixserver.dto.CreateAppointmentRequestDto;
import com.healix.healixserver.dto.PatientResponseDto;
import com.healix.healixserver.service.AppointmentService;
import com.healix.healixserver.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
	
	private final PatientService patientService;
	private final AppointmentService appointmentService;
	
	@PostMapping("/appointments")
	public ResponseEntity<AppointmentResponseDto> createNewAppointment(
		@RequestBody CreateAppointmentRequestDto createAppointmentRequestDto) {
		
		return ResponseEntity.status(HttpStatus.CREATED)
		                     .body(appointmentService.createNewAppointment(createAppointmentRequestDto));
	}
	
	@GetMapping("/profile")
	private ResponseEntity<PatientResponseDto> getPatientProfile() {
		
		Long patientId = 4L;
		return ResponseEntity.ok(patientService.getPatientById(patientId));
	}
	
}