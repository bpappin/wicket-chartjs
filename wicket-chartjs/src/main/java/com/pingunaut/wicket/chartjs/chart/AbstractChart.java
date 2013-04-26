package com.pingunaut.wicket.chartjs.chart;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * AbstractChart provides chart options and a pojo-json mapper.
 * 
 * @param <O>
 *            the generic type of options (has to extend
 *            {@link AbstractChartOptions})
 * 
 * @author Martin Spielmann
 */
public abstract class AbstractChart<O extends AbstractChartOptions> implements IChart<O> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4054134008352228006L;

	/** The options. */
	private O options;

	/** The mapper. */
	private ObjectMapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getMapper()
	 */
	public ObjectMapper getMapper() {
		if (mapper == null) {
			mapper = new ObjectMapper();
		}
		return mapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.IChart#setMapper(com.fasterxml.jackson
	 * .databind.ObjectMapper)
	 */
	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	public O getOptions() {
		return options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.IChart#setOptions(com.pingunaut.wicket
	 * .chartjs.options.AbstractChartOptions)
	 */
	public void setOptions(O options) {
		this.options = options;
	}

}
