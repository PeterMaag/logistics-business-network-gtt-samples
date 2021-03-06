package com.sap.gtt.v2.sample.sst.rest.service;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.sap.gtt.v2.sample.sst.common.utils.ODataUtils;
import com.sap.gtt.v2.sample.sst.common.utils.SSTUtils;
import com.sap.gtt.v2.sample.sst.odata.model.EventStatus;
import com.sap.gtt.v2.sample.sst.odata.model.PlannedEvent;
import com.sap.gtt.v2.sample.sst.odata.service.EventStatusService;
import com.sap.gtt.v2.sample.sst.odata.service.PlannedEventService;
import com.sap.gtt.v2.sample.sst.rest.model.EventsByStatus;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EventsByStatusServiceImplTest {

    @Mock
    private EventStatusService eventStatusService;
    @Mock
    private PlannedEventService plannedEventService;
    @InjectMocks
    private EventsByStatusServiceImpl eventsByStatusService;

    @Test
    void getByShipmentId_givenShipmentId_shouldReturnEventsByStatus() {
        // given
        final String shipmentId = randomUUID().toString();
        final String eventStatusesJson = SSTUtils.getStringFromResource("/odata/event-statuses.json");
        final List<EventStatus> eventStatuses = ODataUtils.readEntitySet(eventStatusesJson, EventStatus.class).getResults();
        final String plannedEventsJson = SSTUtils.getStringFromResource("/odata/planned-events.json");
        final List<PlannedEvent> plannedEvents = ODataUtils.readEntitySet(plannedEventsJson, PlannedEvent.class).getResults();

        when(eventStatusService.getAll()).thenReturn(eventStatuses);
        when(plannedEventService.getAllByShipmentId(shipmentId)).thenReturn(plannedEvents);

        // when
        final List<EventsByStatus> eventsByStatuses = eventsByStatusService.getByShipmentId(shipmentId);

        // then
        assertThat(eventsByStatuses).hasSize(4);
    }
}
