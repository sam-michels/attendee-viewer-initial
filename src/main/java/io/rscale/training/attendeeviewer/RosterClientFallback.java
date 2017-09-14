package io.rscale.training.attendeeviewer;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.Component;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
///import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.ArrayList;

@Component
public class RosterClientFallback implements RosterClient {

	@Override
	public PagedResources<Attendee> getAttendees(int page) {
		List<Attendee> attendees = new ArrayList<Attendee>();
		attendees.add(new Attendee());
		return new PagedResources<Attendee>(attendees, new PageMetadata(1, 1, 1, 1), new Link("/"));
	}

	@Override
	public Attendee getAttendee(String attendeeId) {
		return new Attendee();
	}

}